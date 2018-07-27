package data_dragon.endpoints.cdn.item;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.cdn.item.dto.Item;
import data_dragon.endpoints.cdn.item.dto.ItemDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.util.*;

public class ItemMethods {

    private static String base_url;

    private static Retrofit retrofit;

    private static ItemMethodsInterface itemMethodsInterface;

    //SyncMethods_______________________________________________________________________________________________________

    public interface ItemInterface {

        void onSuccess(Item item);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetItem(int item_id, Platform platform, ItemInterface itemInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        itemMethodsInterface = retrofit.create(ItemMethodsInterface.class);

        Call<ItemDto> itemDtoCall = itemMethodsInterface.GetItem();

        try {
            Response<ItemDto> itemDtoResponse = itemDtoCall.execute();
            if (itemDtoResponse.code() == 200) {
                itemInterface.onSuccess(Objects.requireNonNull(itemDtoResponse.body()).getData().any()
                        .get(String.valueOf(item_id)));
            } else {
                itemInterface.onErrorCode(new ErrorCode(itemDtoResponse.code(), itemDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemInterface.onIOException(e);
        }
    }

    public static void GetItem(int item_id, Platform platform, Locale locale, String version,
                               ItemInterface itemInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        itemMethodsInterface = retrofit.create(ItemMethodsInterface.class);

        Call<ItemDto> itemDtoCall = itemMethodsInterface.GetItem();

        try {
            Response<ItemDto> itemDtoResponse = itemDtoCall.execute();
            if (itemDtoResponse.code() == 200) {
                itemInterface.onSuccess(Objects.requireNonNull(itemDtoResponse.body()).getData().any()
                        .get(String.valueOf(item_id)));
            } else {
                itemInterface.onErrorCode(new ErrorCode(itemDtoResponse.code(), itemDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemInterface.onIOException(e);
        }
    }

    public interface ItemListInterface {

        void onSuccess(List<Item> itemList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public static void GetItemList(Platform platform, ItemListInterface itemListInterface) {

        base_url = platform.getHostCdn() + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        itemMethodsInterface = retrofit.create(ItemMethodsInterface.class);

        Call<ItemDto> itemDtoCall = itemMethodsInterface.GetItem();

        try {
            Response<ItemDto> itemDtoResponse = itemDtoCall.execute();
            if (itemDtoResponse.code() == 200) {
                Map<String, Item> itemMap = Objects.requireNonNull(itemDtoResponse.body()).getData().any();
                Map<String, Item> itemTreeMap = new TreeMap<>(itemMap);

                List<Item> itemList = new ArrayList<>(itemTreeMap.values());
                itemListInterface.onSuccess(itemList);
            } else {
                itemListInterface.onErrorCode(new ErrorCode(itemDtoResponse.code(), itemDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemListInterface.onIOException(e);
        }
    }

    public static void GetItemList(Platform platform, Locale locale, String version,
                                   ItemListInterface itemListInterface) {

        base_url = platform.getHostCdn(locale, version) + "/";

        retrofit = new Retrofit.Builder().baseUrl(base_url)
                .addConverterFactory(JacksonConverterFactory.create()).build();

        itemMethodsInterface = retrofit.create(ItemMethodsInterface.class);

        Call<ItemDto> itemDtoCall = itemMethodsInterface.GetItem();

        try {
            Response<ItemDto> itemDtoResponse = itemDtoCall.execute();
            if (itemDtoResponse.code() == 200) {
                Map<String, Item> itemMap = Objects.requireNonNull(itemDtoResponse.body()).getData().any();
                Map<String, Item> itemTreeMap = new TreeMap<>(itemMap);

                List<Item> itemList = new ArrayList<>(itemTreeMap.values());
                itemListInterface.onSuccess(itemList);
            } else {
                itemListInterface.onErrorCode(new ErrorCode(itemDtoResponse.code(), itemDtoResponse.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemListInterface.onIOException(e);
        }
    }
    //AsyncMethods______________________________________________________________________________________________________

    public interface ItemInterfaceAsync {

        void onSuccess(Item item);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetItemAsync(int item_id, Platform platform, ItemInterfaceAsync itemInterfaceAsync) {

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

                        itemInterfaceAsync.onSuccess(item);
                    }
                } else {
                    itemInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetItemAsync(int item_id, Platform platform, Locale locale, String version,
                                    ItemInterfaceAsync itemInterfaceAsync) {

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

                        itemInterfaceAsync.onSuccess(item);
                    }
                } else {
                    itemInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemInterfaceAsync.onFailure(t);
            }
        });
    }

    public interface ItemListInterfaceAsync {

        void onSuccess(List<Item> itemList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

    public static void GetItemListAsync(Platform platform, ItemListInterfaceAsync itemListInterfaceAsync) {

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

                        Map<String, Item> itemMap = response.body().getData().any();
                        Map<String, Item> itemTreeMap = new TreeMap<>(itemMap);

                        List<Item> itemList = new ArrayList<>(itemTreeMap.values());

                        itemListInterfaceAsync.onSuccess(itemList);
                    }
                } else {
                    itemListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemListInterfaceAsync.onFailure(t);
            }
        });
    }

    public static void GetItemListAsync(Platform platform, Locale locale, String version,
                                        ItemListInterfaceAsync itemListInterfaceAsync) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl(platform.getHostCdn(locale, version) + "/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        ItemMethodsInterface itemMethodsInterface = retrofit
                .create(ItemMethodsInterface.class);

        Call<ItemDto> championShortCall = itemMethodsInterface.GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.code() == 200) {
                    Map<String, Item> itemMap = Objects.requireNonNull(response.body()).getData().any();
                    Map<String, Item> itemTreeMap = new TreeMap<>(itemMap);

                    List<Item> itemList = new ArrayList<>(itemTreeMap.values());

                    itemListInterfaceAsync.onSuccess(itemList);
                } else {
                    itemListInterfaceAsync.onErrorCode(new ErrorCode(response.code(), response.message()));
                }
            }

            @Override
            public void onFailure(Call<ItemDto> call, Throwable t) {
                itemListInterfaceAsync.onFailure(t);
            }
        });
    }

}
