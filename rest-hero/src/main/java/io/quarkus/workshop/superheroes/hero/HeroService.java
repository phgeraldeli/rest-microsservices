package io.quarkus.workshop.superheroes.hero;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;
import java.util.Objects;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.validation.Valid;
@ApplicationScoped
@Transactional(REQUIRED)
public class HeroService {

	@Transactional(SUPPORTS)
	public List<Hero> findAllHeroes() {
		return Hero.listAll();
	}
	
	
	@Transactional(SUPPORTS)
	public Hero findHeroById(Long id) {
		return Hero.findById(id);
	}
	
	@Transactional(SUPPORTS)
    public Hero findRandomHero() {
        Hero randomHero = null;
        while (Objects.isNull(randomHero)) {
            randomHero = Hero.findRandom();
        }
        return randomHero;
    }

    public Hero persistHero(@Valid Hero hero) {
        Hero.persist(hero);
        return hero;
    }

    public Hero updateHero(@Valid Hero hero) {
        Hero entity = Hero.findById(hero.id);
        entity.name = hero.name;
        entity.otherName = hero.otherName;
        entity.level = hero.level;
        entity.picture = hero.picture;
        entity.powers = hero.powers;
        return entity;
    }

    public void deleteHero(Long id) {
        Hero hero = Hero.findById(id);
        hero.delete();
    }
	
}
