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

package io.gs2.consumableItem.control;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

import io.gs2.consumableItem.model.Inventory;


/**
 * @author Game Server Services, Inc.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeMyInventoryResult {

	/** 次のページを読み込むためのトークン */
	String nextPageToken;

	/** 所持品 */
	List<Inventory> items;


	/**
	 * 次のページを読み込むためのトークンを取得
	 *
	 * @return 次のページを読み込むためのトークン
	 */
	public String getNextPageToken() {
		return nextPageToken;
	}

	/**
	 * 次のページを読み込むためのトークンを設定
	 *
	 * @param nextPageToken 次のページを読み込むためのトークン
	 */
	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
	}

	/**
	 * 所持品を取得
	 *
	 * @return 所持品
	 */
	public List<Inventory> getItems() {
		return items;
	}

	/**
	 * 所持品を設定
	 *
	 * @param items 所持品
	 */
	public void setItems(List<Inventory> items) {
		this.items = items;
	}

}