/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import com.javatunes.catalog.MusicItem;

import java.util.Collection;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // TODO
        //testFindById();  //complete
        //testFindByKeyword();  //complete
        //testFindByCategory();  //complete
        //testSize();  //complete
        testGetAll();
        
        // TASK complete tests
//        testFindSelfTitled();
//        testFindCheapRock();
//        testNumberInGenre();
//        testAveragePrice();
//        testFindCheapest();
    }
    private static void testFindById() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(9L);
        System.out.println(found);

        MusicItem notFound = catalog.findById(100L);
        System.out.println(notFound);
    }

    private static void testFindByKeyword() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> rockItems = catalog.findByKeyword("Seal");
        dump(rockItems);
    }

    private static void testFindByCategory() {
        InMemoryCatalog catalog = new InMemoryCatalog();

        Collection<MusicItem> popItems = catalog.findByCategory(MusicCategory.POP);
        dump(popItems);
    }

    private static void testSize() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.size()); // should be 18 - Complete
    }

    private static void testGetAll() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        Collection<MusicItem> allItems = catalog.getAll();
        allItems.clear();  // should throw exception
        // dump(allItems);

    }

    private static void testFindSelfTitled() {
    }

    private static void testFindCheapRock() {

    }
    private static void testNumberInGenre() {
    }

    private static void testAveragePrice() {
    }

    private static void testFindCheapest() {

    }



    // helper method to show the collection "vertically"
    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }


}