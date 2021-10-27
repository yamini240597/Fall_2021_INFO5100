package edu.northeastern.malik_y;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Question 1: Interface and Abstract class--");
        int frankensteinBorrowDate = 2;
        int frankensteinReturnDate = 11;

        int anneFrankBorrowDate = 1;
        int anneFrankReturnDate = 14;

        int givenDate = 13;

        Fiction frankenstein = new Fiction("Frankenstein", 4.99, "1908");
        NonFiction anneFrank = new NonFiction("Anne Frank", 6.99, "1961");
        Reference worldMap = new Reference("World Maps", 2.99, "2021");

        System.out.println(frankenstein.description());
        System.out.println(anneFrank.description());
        System.out.println(worldMap.description());

        frankenstein.setBorrowDate(frankensteinBorrowDate);
        frankenstein.setReturnDate(frankensteinReturnDate);

        System.out.println();
        System.out.println("Availability status: " + frankenstein.isAvailable(givenDate));
        System.out.println();

        anneFrank.setBorrowDate(anneFrankBorrowDate);
        anneFrank.setReturnDate(anneFrankReturnDate);

        System.out.println("Availability status: " + anneFrank.isAvailable(givenDate));
        }
    }
