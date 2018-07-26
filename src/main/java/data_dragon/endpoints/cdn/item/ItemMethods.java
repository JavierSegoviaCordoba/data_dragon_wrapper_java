package data_dragon.endpoints.cdn.item;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import data_dragon.DataDragon;
import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.item.dto.Item;
import data_dragon.endpoints.cdn.item.dto.ItemDto;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ItemMethods extends DataDragon {

    public static Item GetItem(Platform platform, int item_id) {

        String url = platform.getHostCdn() + "/item" + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ItemDto.class).getData().any().get(String.valueOf(item_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Item GetItem(Platform platform, Locale locale, String version, int item_id) {

        String url = platform.getHostCdn(locale, version) + "/item" + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return objectMapper.readValue(new URL(url), ItemDto.class).getData().any().get(String.valueOf(item_id));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Item> GetItemList(Platform platform) {

        String url = platform.getHostCdn() + "/item" + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            return new ArrayList<>(objectMapper.readValue(new URL(url), ItemDto.class).getData().any().values());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<Item> GetItemList(Platform platform, Locale locale, String version) {

        String url = platform.getHostCdn(locale, version) + "/item" + ".json";

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {

            return new ArrayList<>(objectMapper.readValue(new URL(url), ItemDto.class).getData().any().values());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    //Asynchronous methods
    public static void GetItem(Platform platform, int item_id, ItemInterface itemInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ItemMethodsInterface itemMethodsInterface = retrofit
                .create(ItemMethodsInterface.class);

        Call<ItemDto> championShortCall = itemMethodsInterface.GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        Item item = response.body().getData().any().get(String.valueOf(item_id));

                        itemInterface.onSuccess(item);
                    }
                } else {
                    itemInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemInterface.onError(t);
            }
        });
    }

    public static void GetItem(Platform platform, Locale locale, String version, int item_id,
                               ItemInterface itemInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ItemMethodsInterface itemMethodsInterface = retrofit
                .create(ItemMethodsInterface.class);

        Call<ItemDto> championShortCall = itemMethodsInterface.GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        Item item = response.body().getData().any().get(String.valueOf(item_id));

                        itemInterface.onSuccess(item);
                    }
                } else {
                    itemInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemInterface.onError(t);
            }
        });
    }

    public static void GetItemList(Platform platform, ItemListInterface itemListInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn() + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ItemMethodsInterface itemMethodsInterface = retrofit
                .create(ItemMethodsInterface.class);

        Call<ItemDto> championShortCall = itemMethodsInterface.GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        List<Item> itemList = new ArrayList<>(response.body().getData().any().values());

                        itemListInterface.onSuccess(itemList);
                    }
                } else {
                    itemListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemListInterface.onError(t);
            }
        });
    }

    public static void GetItemList(Platform platform, Locale locale, String version, ItemListInterface itemListInterface) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ItemMethodsInterface itemMethodsInterface = retrofit
                .create(ItemMethodsInterface.class);

        Call<ItemDto> championShortCall = itemMethodsInterface.GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {

                        List<Item> itemList = new ArrayList<>(response.body().getData().any().values());

                        itemListInterface.onSuccess(itemList);
                    }
                } else {
                    itemListInterface.onError(response.code());
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemListInterface.onError(t);
            }
        });
    }

    //Interfaces
    public interface ItemInterface {

        void onSuccess(Item item);

        void onError(int code);

        void onError(Throwable t);
    }

    public interface ItemListInterface {

        void onSuccess(List<Item> itemList);

        void onError(int code);

        void onError(Throwable t);
    }
}
