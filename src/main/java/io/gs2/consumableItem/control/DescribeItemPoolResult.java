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

import io.gs2.consumableItem.model.ItemPool;


/**
 * @author Game Server Services, Inc.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DescribeItemPoolResult {

	/** 次のページを読み込むためのトークン */
	String nextPageToken;

	/** 消費型アイテムプール */
	List<ItemPool> items;


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
	 * 消費型アイテムプールを取得
	 *
	 * @return 消費型アイテムプール
	 */
	public List<ItemPool> getItems() {
		return items;
	}

	/**
	 * 消費型アイテムプールを設定
	 *
	 * @param items 消費型アイテムプール
	 */
	public void setItems(List<ItemPool> items) {
		this.items = items;
	}

}