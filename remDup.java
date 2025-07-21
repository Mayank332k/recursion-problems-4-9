public class remDup {
    public static boolean map[] = new boolean[26]; // declare kiya arr defvalue = false #javarule

    public static void remove(int idx, String str, String newString) { 
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);

        if (map[currChar - 'a']) { // kya abhi vala char pichhle kisi bi idx pe hai .
            remove(idx + 1, str, newString); // to kcuhh nhi funtion call kro bas.
        } else {
            newString += currChar; // and use new str me add kar do.
            map[currChar - 'a'] = true; // idx ko ko false se true kr do.
            remove(idx + 1, str, newString); // again fun call kar do.
        }
    }

    public static void main(String[] args) {
        String str = "aabbccdd ";
        remove(0, str, "");
    }
}
