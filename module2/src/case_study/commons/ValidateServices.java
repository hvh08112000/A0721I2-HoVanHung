package case_study.commons;

public class ValidateServices {
    public static boolean validateIdServiceVilla(String id) {
        String regexId = "^SVVL-[0-9]{4}";
        return id.matches(regexId);
    }
    public static boolean validateIdServiceHouse(String id) {
        String regexId = "^SVHO-[0-9]{4}";
        return id.matches(regexId);
    }
    public static boolean validateIdServiceRoom(String id) {
        String regexId = "^SVRO-[0-9]{4}";
        return id.matches(regexId);
    }
    public static boolean validateNameService(String name) {
        String regexName = "^[A-Z][a-z]+";
        return name.matches(regexName);
    }
    public static boolean validateDate(String date) {
        String regexArea = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        return date.matches(regexArea);
    }
}
