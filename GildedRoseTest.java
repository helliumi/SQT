package fi.oulu.tol.sqat.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import fi.oulu.tol.sqat.GildedRose;
import fi.oulu.tol.sqat.Item;

public class GildedRoseTest {

	@Test
	public void testTheTruth() {
		assertTrue(true);
	}
	@Test
	public void DexterityVestBasicSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 10, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 19, quality);
		assertEquals("Failed sellin for Dexterity Vest", 9, sellin); 
	}
	
	@Test
	public void DexterityVestGoodQualityLowSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 2, 4));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 3, quality);
		assertEquals("Failed sellin for Dexterity Vest", 1, sellin); 
	}
	
	@Test
	public void DexterityVestLowQualityGoodSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("+5 Dexterity Vest", 4, 0));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Dexterity Vest", 0, quality);
		assertEquals("Failed sellin for Dexterity Vest", 3, sellin); 
	}
	
	@Test
	public void AgedBrieBasicSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Aged Brie", 1, quality);
		assertEquals("Failed sellin for Aged Brie", 1, sellin); 
	}
	
	@Test
	public void AgedBrieGoodQualityLowSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 0, 2));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for  Aged Brie", 4, quality);
		assertEquals("Failed sellin for Aged Brie", -1, sellin); 
	}
	
	@Test
	public void AgedBrieLowQualityGoodSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 4, 0));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Aged Brie", 1, quality);
		assertEquals("Failed sellin for Aged Brie", 3, sellin); 
	}
	
	@Test
	public void ElixixOfTheMongooseBasicSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 5, 7));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Elixir of the Mongoose", 6, quality);
		assertEquals("Failed sellin for Elixir of the Mongoose", 4, sellin); 
	}
	
	@Test
	public void ElixixOfTheMongooseGoodQualityLowSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 2, 7));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for  Elixir of the Mongoose", 6, quality);
		assertEquals("Failed sellin for Elixir of the Mongoose", 1, sellin); 
	}
	
	@Test
	public void ElixixOfTheMongooseLowQualityGoodSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Elixir of the Mongoose", 8, 3));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Elixir of the Mongoose", 2, quality);
		assertEquals("Failed sellin for Elixir of the Mongoose", 7, sellin); 
	}

	@Test
	public void SulfurasNeverChange() {
		//create an inn, add an item, and simulate one day
				GildedRose inn = new GildedRose();
				inn.setItem(new Item("Sulfuras, Hand of Ragnaro", 0, 80));
				inn.oneDay();
				
				//access a list of items, get the quality of the one set
				List<Item> items = inn.getItems();
				int quality = items.get(0).getQuality();
				int sellin = items.get(0).getSellIn();
				
				assertEquals("Sulfuras changes", 78, quality);
				assertEquals("Sulfuras changes", -1, sellin);
	}
	
	@Test
	public void BackstagePassBasicSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn(); 
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Backstage passes to a TAFKAL80ETC concert", 21, quality);
		assertEquals("Failed sellin for Backstage passes to a TAFKAL80ETC concert", 14, sellin); 
	}
	
	
	@Test
	public void BackstageBassGoodQualityNoSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Backstage passes to a TAFKAL80ETC concert", 0, quality);
		assertEquals("Failed sellin for Backstage passes to a TAFKAL80ETC concert", -1, sellin); 
	}
	
	@Test
	public void BackstagePassLowQualityGoodSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Backstage passes to a TAFKAL80ETC concert", 23, quality);
		assertEquals("Failed sellin for Backstage passes to a TAFKAL80ETC concert", 4, sellin); 
	}
	
	@Test
	public void ConjuredManaCakeBasicSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 3, 6));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn(); 
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Conjured Mana Cake", 5, quality);
		assertEquals("Failed sellin for Conjured Mana Cake", 2, sellin); 
	}
	
	@Test
	public void ConjuredManaCakeGoodQualityLowSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 2, 7));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Conjured Mana Cake", 6, quality);
		assertEquals("Failed sellin for Conjured Mana Cake", 1, sellin); 
	}
	
	@Test
	public void ConjuredManaCakeLowQualityGoodSell() {
		//create an inn, add an item, and simulate one day
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Conjured Mana Cake", 5, 2));
		inn.oneDay();
		
		//access a list of items, get the quality of the one set
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		int sellin = items.get(0).getSellIn();
		
		//assert quality has decreased by one
		assertEquals("Failed quality for Conjured Mana Cake", 1, quality);
		assertEquals("Failed sellin for Conjured Mana Cake", 4, sellin); 
	}
	
	@Test
	public void QualityOfItemNotNegative() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 0));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals(-1, 0, quality); 
	}
	
	@Test
	public void QualityNeverOver50() {
		GildedRose inn = new GildedRose();
		inn.setItem(new Item("Aged Brie", 2, 50));
		inn.oneDay();
		
		List<Item> items = inn.getItems();
		int quality = items.get(0).getQuality();
		
		assertEquals("Quality over 50", 50, quality);
		
	}
	
}
