package data_dragon.endpoints.cdn.item;

import data_dragon.constant.Locale;
import data_dragon.constant.Platform;
import data_dragon.endpoints.DataDragonUtils;
import data_dragon.endpoints.cdn.item.dto.Item;
import data_dragon.endpoints.cdn.item.dto.ItemDto;
import data_dragon.utils.ErrorCode;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.util.*;

public class ItemMethods {

    //SyncMethods_______________________________________________________________________________________________________

    public static void GetItem(int item_id, Platform platform, ItemInterface itemInterface) {

        Call<ItemDto> call = DataDragonUtils.CreateDataDragonService(platform).GetItem();

        try {
            Response<ItemDto> response = call.execute();
            if (response.isSuccessful()) {
                Item item = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(item_id));
                if (item != null) {
                    itemInterface.onSuccess(item);
                } else {
                    itemInterface.onNotFound();
                }
            } else {
                itemInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemInterface.onIOException(e);
        }
    }

    public static void GetItem(int item_id, Platform platform, Locale locale, String version,
                               ItemInterface itemInterface) {

        Call<ItemDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetItem();

        try {
            Response<ItemDto> response = call.execute();
            if (response.isSuccessful()) {
                Item item = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(item_id));
                if (item != null) {
                    itemInterface.onSuccess(item);
                } else {
                    itemInterface.onNotFound();
                }
            } else {
                itemInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemInterface.onIOException(e);
        }
    }

    public static void GetItemList(Platform platform, ItemListInterface itemListInterface) {

        Call<ItemDto> call = DataDragonUtils.CreateDataDragonService(platform).GetItem();

        try {
            Response<ItemDto> response = call.execute();
            if (response.isSuccessful()) {
                Map<String, Item> itemMap = Objects.requireNonNull(response.body()).getData().any();
                Map<String, Item> itemTreeMap = new TreeMap<>(itemMap);

                List<Item> itemList = new ArrayList<>(itemTreeMap.values());
                itemListInterface.onSuccess(itemList);
            } else {
                itemListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemListInterface.onIOException(e);
        }
    }

    public static void GetItemList(Platform platform, Locale locale, String version,
                                   ItemListInterface itemListInterface) {

        Call<ItemDto> call = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetItem();

        try {
            Response<ItemDto> response = call.execute();
            if (response.isSuccessful()) {
                Map<String, Item> itemMap = Objects.requireNonNull(response.body()).getData().any();
                Map<String, Item> itemTreeMap = new TreeMap<>(itemMap);

                List<Item> itemList = new ArrayList<>(itemTreeMap.values());
                itemListInterface.onSuccess(itemList);
            } else {
                itemListInterface.onErrorCode(new ErrorCode(response.code(), response.message()));
            }
        } catch (IOException e) {
            e.printStackTrace();
            itemListInterface.onIOException(e);
        }
    }

    public static void GetItemAsync(int item_id, Platform platform, ItemInterfaceAsync itemInterfaceAsync) {

        Call<ItemDto> championShortCall = DataDragonUtils.CreateDataDragonService(platform).GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        Item item = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(item_id));
                        if (item != null) {
                            itemInterfaceAsync.onSuccess(item);
                        } else {
                            itemInterfaceAsync.onNotFound();
                        }
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

        Call<ItemDto> championShortCall = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.isSuccessful()) {
                    Item item = Objects.requireNonNull(response.body()).getData().any().get(String.valueOf(item_id));
                    if (item != null) {
                        itemInterfaceAsync.onSuccess(item);
                    } else {
                        itemInterfaceAsync.onNotFound();
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
    //AsyncMethods______________________________________________________________________________________________________

    public static void GetItemListAsync(Platform platform, ItemListInterfaceAsync itemListInterfaceAsync) {

        Call<ItemDto> championShortCall = DataDragonUtils.CreateDataDragonService(platform).GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.isSuccessful()) {
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

        Call<ItemDto> championShortCall = DataDragonUtils.CreateDataDragonService(platform, locale, version).GetItem();

        championShortCall.enqueue(new Callback<ItemDto>() {
            @Override
            public void onResponse(Call<ItemDto> call, Response<ItemDto> response) {
                if (response.isSuccessful()) {
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

    public interface ItemInterface {

        void onSuccess(Item item);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onIOException(IOException e);
    }

    public interface ItemListInterface {

        void onSuccess(List<Item> itemList);

        void onErrorCode(ErrorCode errorCode);

        void onIOException(IOException e);
    }

    public interface ItemInterfaceAsync {

        void onSuccess(Item item);

        void onErrorCode(ErrorCode errorCode);

        void onNotFound();

        void onFailure(Throwable throwable);
    }

    public interface ItemListInterfaceAsync {

        void onSuccess(List<Item> itemList);

        void onErrorCode(ErrorCode errorCode);

        void onFailure(Throwable throwable);
    }

}
