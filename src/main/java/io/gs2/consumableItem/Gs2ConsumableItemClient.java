/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.consumableItem;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

import io.gs2.AbstractGs2Client;
import io.gs2.Gs2Constant;
import io.gs2.model.IGs2Credential;
import io.gs2.consumableItem.control.*;

/**
 * GS2 ConsumableItem API クライアント
 *
 * @author Game Server Services, Inc.
 *
 */
public class Gs2ConsumableItemClient extends AbstractGs2Client<Gs2ConsumableItemClient> {

	public static String ENDPOINT = "consumable-item";

	/**
	 * コンストラクタ。
	 *
	 * @param credential 認証情報
	 */
	public Gs2ConsumableItemClient(IGs2Credential credential) {
		super(credential);
	}


	/**
	 * 消費型アイテムプールの状態を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public GetItemPoolStatusResult getItemPoolStatus(GetItemPoolStatusRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/status";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetItemPoolStatusRequest.Constant.MODULE,
				GetItemPoolStatusRequest.Constant.FUNCTION);

		return doRequest(get, GetItemPoolStatusResult.class);
	}


	/**
	 * ユーザが所持しているインベントリの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public DescribeInventoryResult describeInventory(DescribeInventoryRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/user/" + (request.getUserId() == null ? "null" : request.getUserId()) + "";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeInventoryRequest.Constant.MODULE,
				DescribeInventoryRequest.Constant.FUNCTION);

		return doRequest(get, DescribeInventoryResult.class);
	}


	/**
	 * 消費型アイテムプールを新規作成します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public CreateItemPoolResult createItemPool(CreateItemPoolRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("serviceClass", request.getServiceClass())
				.put("name", request.getName())
				.put("description", request.getDescription());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/itemPool",
				credential,
				ENDPOINT,
				CreateItemPoolRequest.Constant.MODULE,
				CreateItemPoolRequest.Constant.FUNCTION,
				body.toString());

		return doRequest(post, CreateItemPoolResult.class);
	}


	/**
	 * 消費型アイテムプールの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public DescribeItemPoolResult describeItemPool(DescribeItemPoolRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeItemPoolRequest.Constant.MODULE,
				DescribeItemPoolRequest.Constant.FUNCTION);

		return doRequest(get, DescribeItemPoolResult.class);
	}


	/**
	 * 消費型アイテムを取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public GetItemResult getItem(GetItemRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetItemRequest.Constant.MODULE,
				GetItemRequest.Constant.FUNCTION);

		return doRequest(get, GetItemResult.class);
	}


	/**
	 * 消費型アイテムを削除します<br>
	 * <br>
	 * 既にアイテムを所持しているユーザがいる場合、そのアイテムはインベントリから削除されることはありません。<br>
	 * 消費型アイテムを削除することで新しくアイテムを付与することはできなくなりますが、消費することは出来ます。<br>
	 * <br>
	 * これを防ぎたい場合はすべてのユーザのインベントリを走査して該当アイテムを削除する必要があります。<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */
	public void deleteItem(DeleteItemRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "",
				credential,
				ENDPOINT,
				DeleteItemRequest.Constant.MODULE,
				DeleteItemRequest.Constant.FUNCTION);

		doRequest(delete, null);
	}


	/**
	 * ユーザが所持しているインベントリの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public DescribeMyInventoryResult describeMyInventory(DescribeMyInventoryRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/my";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeMyInventoryRequest.Constant.MODULE,
				DescribeMyInventoryRequest.Constant.FUNCTION);

        get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, DescribeMyInventoryResult.class);
	}


	/**
	 * 消費型アイテムを新規作成します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public CreateItemResult createItem(CreateItemRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("name", request.getName());

        if(request.getMax() != null) body.put("max", request.getMax());
		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item",
				credential,
				ENDPOINT,
				CreateItemRequest.Constant.MODULE,
				CreateItemRequest.Constant.FUNCTION,
				body.toString());

		return doRequest(post, CreateItemResult.class);
	}


	/**
	 * 消費型アイテムの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public DescribeItemResult describeItem(DescribeItemRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item";

        List<NameValuePair> queryString = new ArrayList<>();
        if(request.getPageToken() != null) queryString.add(new BasicNameValuePair("pageToken", String.valueOf(request.getPageToken())));
        if(request.getLimit() != null) queryString.add(new BasicNameValuePair("limit", String.valueOf(request.getLimit())));


		if(queryString.size() > 0) {
			url += "?" + URLEncodedUtils.format(queryString, "UTF-8");
		}
		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeItemRequest.Constant.MODULE,
				DescribeItemRequest.Constant.FUNCTION);

		return doRequest(get, DescribeItemResult.class);
	}


	/**
	 * インベントリのアイテムを消費します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public ConsumeInventoryResult consumeInventory(ConsumeInventoryRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("count", request.getCount());

		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "/user/" + (request.getUserId() == null ? "null" : request.getUserId()) + "",
				credential,
				ENDPOINT,
				ConsumeInventoryRequest.Constant.MODULE,
				ConsumeInventoryRequest.Constant.FUNCTION,
				body.toString());

		return doRequest(put, ConsumeInventoryResult.class);
	}


	/**
	 * インベントリにアイテムを加えます<br>
	 * <br>
	 * アイテムに所持数の上限が設定されている状態で、複数個付与することによって<br>
	 * 所持数の上限を超えてしまうケースでは一切付与せずエラー応答を返します。<br>
	 * <br>
	 * 例えば、所持数上限 10 のアイテムで、8個所持しているユーザに 3個 付与しようとすると<br>
	 * 1個も付与せずにエラーを返します。<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public AcquisitionInventoryResult acquisitionInventory(AcquisitionInventoryRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("count", request.getCount());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "/user/" + (request.getUserId() == null ? "null" : request.getUserId()) + "",
				credential,
				ENDPOINT,
				AcquisitionInventoryRequest.Constant.MODULE,
				AcquisitionInventoryRequest.Constant.FUNCTION,
				body.toString());

		return doRequest(post, AcquisitionInventoryResult.class);
	}


	/**
	 * インベントリの内容を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public GetInventoryResult getInventory(GetInventoryRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "/user/" + (request.getUserId() == null ? "null" : request.getUserId()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetInventoryRequest.Constant.MODULE,
				GetInventoryRequest.Constant.FUNCTION);

		return doRequest(get, GetInventoryResult.class);
	}


	/**
	 * インベントリからアイテムを削除します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */
	public void deleteInventory(DeleteInventoryRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "/user/" + (request.getUserId() == null ? "null" : request.getUserId()) + "",
				credential,
				ENDPOINT,
				DeleteInventoryRequest.Constant.MODULE,
				DeleteInventoryRequest.Constant.FUNCTION);

		doRequest(delete, null);
	}


	/**
	 * サービスクラスの一覧を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public DescribeServiceClassResult describeServiceClass(DescribeServiceClassRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/serviceClass";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				DescribeServiceClassRequest.Constant.MODULE,
				DescribeServiceClassRequest.Constant.FUNCTION);

		return doRequest(get, DescribeServiceClassResult.class);
	}


	/**
	 * インベントリのアイテムを消費します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public ConsumeMyInventoryResult consumeMyInventory(ConsumeMyInventoryRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("count", request.getCount());

		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "/my",
				credential,
				ENDPOINT,
				ConsumeMyInventoryRequest.Constant.MODULE,
				ConsumeMyInventoryRequest.Constant.FUNCTION,
				body.toString());

        put.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(put, ConsumeMyInventoryResult.class);
	}


	/**
	 * インベントリにアイテムを加えます<br>
	 * <br>
	 * アイテムに所持数の上限が設定されている状態で、複数個付与することによって<br>
	 * 所持数の上限を超えてしまうケースでは一切付与せずエラー応答を返します。<br>
	 * <br>
	 * 例えば、所持数上限 10 のアイテムで、8個所持しているユーザに 3個 付与しようとすると<br>
	 * 1個も付与せずにエラーを返します。<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public AcquisitionMyInventoryResult acquisitionMyInventory(AcquisitionMyInventoryRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("count", request.getCount());

		HttpPost post = createHttpPost(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "/my",
				credential,
				ENDPOINT,
				AcquisitionMyInventoryRequest.Constant.MODULE,
				AcquisitionMyInventoryRequest.Constant.FUNCTION,
				body.toString());

        post.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(post, AcquisitionMyInventoryResult.class);
	}


	/**
	 * インベントリの内容を取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public GetMyInventoryResult getMyInventory(GetMyInventoryRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "/item/" + (request.getItemName() == null ? "null" : request.getItemName()) + "/my";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetMyInventoryRequest.Constant.MODULE,
				GetMyInventoryRequest.Constant.FUNCTION);

        get.setHeader("X-GS2-ACCESS-TOKEN", request.getAccessToken());
		return doRequest(get, GetMyInventoryResult.class);
	}


	/**
	 * 消費型アイテムプールを更新します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public UpdateItemPoolResult updateItemPool(UpdateItemPoolRequest request) {
		ObjectNode body = JsonNodeFactory.instance.objectNode()
				.put("serviceClass", request.getServiceClass())
				.put("description", request.getDescription());

		HttpPut put = createHttpPut(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "",
				credential,
				ENDPOINT,
				UpdateItemPoolRequest.Constant.MODULE,
				UpdateItemPoolRequest.Constant.FUNCTION,
				body.toString());

		return doRequest(put, UpdateItemPoolResult.class);
	}


	/**
	 * 消費型アイテムプールを取得します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 * @return 結果
	 */
	public GetItemPoolResult getItemPool(GetItemPoolRequest request) {
	    String url = Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "";



		HttpGet get = createHttpGet(
				url,
				credential,
				ENDPOINT,
				GetItemPoolRequest.Constant.MODULE,
				GetItemPoolRequest.Constant.FUNCTION);

		return doRequest(get, GetItemPoolResult.class);
	}


	/**
	 * 消費型アイテムプールを削除します<br>
	 * <br>
	 *
	 * @param request リクエストパラメータ
	 */
	public void deleteItemPool(DeleteItemPoolRequest request) {
		HttpDelete delete = createHttpDelete(
				Gs2Constant.ENDPOINT_HOST + "/itemPool/" + (request.getItemPoolName() == null ? "null" : request.getItemPoolName()) + "",
				credential,
				ENDPOINT,
				DeleteItemPoolRequest.Constant.MODULE,
				DeleteItemPoolRequest.Constant.FUNCTION);

		doRequest(delete, null);
	}


}