# Data Dragon wrapper for java
This is a Riot Games Data Dragon wrapper for Java. You can get all the data from Data Dragon easily and use it in your Java or Android app.
## Usage
Bellow you can see an example, you can check the usage of all methods [here](https://github.com/JavierSegoviaCordoba/data_dragon_wrapper_java/wiki).

This is a summary of how this library works for all methods

The following code let you to get a champion.

- The first parameter is always the id/name/key of your search (if it is necessary).
- If you want to get a custom LOCALE and VERSION, you can add them as second and third parameter (first and second if there isn't id/name/key)
- The last parameter you have always to use a new... Interface.

The interface help you to manage the response from the server:

- You get a champion object.
- The champion doesn't exit or whatever problem, you get a response code unsuccessful.
- You get an exception.
         
```java
dataDragon.getChampion("Graves", new ChampionMethods.ChampionInterface() {
    @Override
    public void onSuccess(Champion champion) {
        System.out.println(champion.getName() + ": " + champion.getLore());
    }

    @Override
    public void onErrorCode(ErrorCode errorCode) {
        System.out.println(errorCode.toString());
    }

    @Override
    public void onIOException(IOException e) {
        System.out.println(e.getMessage());
    }
});
```