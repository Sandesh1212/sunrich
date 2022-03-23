package com.sandesh;

 class Book
       {
        String title;
        String author;
        double price;

        //constructor
        Book(String title, String author, double newPrice)
        {
            this.title = title;
            this.author = author;
            this.price = newPrice;
        }

           public static void main(String[]args)
           {
               Book b1=new Book("core java","author1",300);
               b1.show();
               System.out.println("__________________________");
               Book b2=new Book("advance java","author2",200);
               b2.show();
           }

           public String getTitle()
           {
               System.out.println("Title of Book: "+title);
               return title;
           }

           public String getAuthor()
           {
               System.out.println("Author of Book: "+author);
               return author;
           }

           public double getPrice()
           {
               System.out.println("Price of Book: "+price);
               return price;
           }

           public void show()
           {
               getTitle();
               getAuthor();
               getPrice();
           }
       }

