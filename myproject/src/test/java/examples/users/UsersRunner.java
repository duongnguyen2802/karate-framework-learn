package examples.users;

import com.intuit.karate.junit5.Karate;

class UsersRunner {
    
    @Karate.Testc
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }    

}
