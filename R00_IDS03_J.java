public class R00_IDS03_J{
    /*
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + username);
    }
    else {
        logger.severe("User login failed for: " + username);
    }
    */
    
    

    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)) 
            ? username : "unauthorized user";
    }
    
    public static void main(String []args){
        if (loginSuccessful) {
            printf("User login succeeded for: " + sanitizeUser(username));
        }
        else {
            printf("User login failed for: " + sanitizeUser(username));
        }
    }
}
