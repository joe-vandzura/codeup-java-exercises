public class ServerNameGenerator {

    public static String randomString(String[] array) {
        return array[(int) Math.round(Math.random() *(10 - 1) + 1) - 1];
    }

    public static void main(String[] args) {

        String[] adjectives = {"adorable", "aggressive", "busy", "calm", "dangerous", "disturbed", "dizzy", "grotesque", "inquisitive", "ugliest"};

        String[] nouns = {"government", "person", "television", "product", "story", "community", "movie", "army", "environment", "marriage"};

        System.out.println("Here is your server name:\n" + randomString(adjectives) + "-" + randomString(nouns));
        System.out.println("Here is your server name:\n" + randomString(adjectives) + "-" + randomString(nouns));
        System.out.println("Here is your server name:\n" + randomString(adjectives) + "-" + randomString(nouns));
        System.out.println("Here is your server name:\n" + randomString(adjectives) + "-" + randomString(nouns));



    }
}
