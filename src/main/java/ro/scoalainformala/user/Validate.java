package ro.scoalainformala.user;

public class Validate {

    public static boolean input(String str, String type) {

        // int
        if ("int".equals(type)) {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return false; // Not int
            }
            return true;
        }

        // long
        if ("long".equals(type)) {
            try {
                Long.parseLong(str);
            } catch (NumberFormatException e) {
                return false; // Not long
            }
            return true;
        }

        //float
        if ("float".equals(type)) {
            try {
                Float.parseFloat(str);
            } catch (NumberFormatException e) {
                return false; // Not float
            }
            return true;
        }

        //double
        if ("double".equals(type)) {
            try {
                Double.parseDouble(str);
            } catch (NumberFormatException e) {
                return false; // Not double
            }
            return true;
        }

        return true;
    }


}
