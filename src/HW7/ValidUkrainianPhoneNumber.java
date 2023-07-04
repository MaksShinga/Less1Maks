package HW7;

public class ValidUkrainianPhoneNumber {
    public static boolean isValidUkrainianPhoneNumber(String phoneNumber) {
        String regex = "\\+380\\d{9}";

        return phoneNumber.matches(regex);
    }
    public static void main(String[] args) {
        String phoneNumber1 = "+380123456789";
        String phoneNumber2 = "+38012345";
        String phoneNumber3 = "123456789";
        String phoneNumber4 = "+380abcdefghi";

        System.out.println(phoneNumber1 + ": " + isValidUkrainianPhoneNumber(phoneNumber1));
        System.out.println(phoneNumber2 + ": " + isValidUkrainianPhoneNumber(phoneNumber2));
        System.out.println(phoneNumber3 + ": " + isValidUkrainianPhoneNumber(phoneNumber3));
        System.out.println(phoneNumber4 + ": " + isValidUkrainianPhoneNumber(phoneNumber4));
    }
}
