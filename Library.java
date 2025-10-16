class Library {
    public static void main(String[] args){
        // Δημιουργία βιβλίων
        Book carmilla = new Book("Carmilla", "Sheridan Le Fanu", 270);
        Book dracula = new Book("Dracula", "Bram Stoker", 418);
        Book littleMermaid = new Book("Little Mermaid","Sarah Gibb", 32);
        Book donQuixote = new Book("Don Quixote", "Miguel de Cervantes", 1072);

        // Δημιουργία χρηστών
        User maria = new User("Maria", "1998-05-20");
        User john = new User("John", "1995-09-12");
        User alex = new User("Alex", "2000-10-28"); 

        // Δανεισμός βιβλίων
        maria.borrow(carmilla);
        john.borrow(dracula);
        maria.borrow(littleMermaid);
        alex.borrow(donQuixote);

        // Προσπάθεια να ξαναδανειστεί ήδη δανεισμένο βιβλίο
        john.borrow(carmilla);
        maria.borrow(donQuixote);

        // Εμφάνιση στοιχείων
        System.out.println("\n--- Library Status ---");
        System.out.println(maria);
        System.out.println();
        System.out.println(john);
        System.out.println(alex);

        // Επιστροφή βιβλίου
        maria.returnBook(carmilla);

        System.out.println("\n--- After Returning ---");
        System.out.println(maria);
    }
}