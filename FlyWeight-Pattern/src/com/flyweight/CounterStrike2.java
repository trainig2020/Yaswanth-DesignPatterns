package com.flyweight;

public class CounterStrike2 {

	public static void main(String[] args) {

		Player p = PlayerFactory.getPlayer("CounterTerrorist");

		Player p1 = PlayerFactory.getPlayer("CounterTerrorist");

		Player p2 = PlayerFactory.getPlayer("Terrorist");

		p.assignWeapon("AK-47");

		p.mission();

		p1.assignWeapon("M416");

		p1.mission();

		p2.assignWeapon("AKM");

		p2.mission();

	}

}
