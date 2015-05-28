# Steam4j 
Steam4j is a Steam API binding library for the Java language.

## Version
1.0

### Getting Steam Client
At first it is necessary to acquire Steam Client to use steam4j.
Api key can be generated http://steamcommunity.com/dev/apikey.

```java
String apiKey = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

SteamConfiguration configuration = new SteamConfiguration(apiKey);
SteamClient steamClient = SteamFactory.getInstance(configuration).getClient();
```
