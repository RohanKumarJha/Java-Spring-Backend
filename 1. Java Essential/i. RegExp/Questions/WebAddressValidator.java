public class WebAddressValidator {
    public boolean isValidWebAddress(String webAddress) {
        String regex = "^(http|https)[:][/]{2}[w]{3}[.]([a-zA-Z0-9]+)[.](com|org|net)$";
        return webAddress.matches(regex);
    }
}