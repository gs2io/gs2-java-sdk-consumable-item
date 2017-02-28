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

import io.gs2.consumableItem.model.Item;


/**
 * @author Game Server Services, Inc.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class CreateItemResult {

	/** 消費型アイテム */
	Item item;


	/**
	 * 消費型アイテムを取得
	 *
	 * @return 消費型アイテム
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * 消費型アイテムを設定
	 *
	 * @param item 消費型アイテム
	 */
	public void setItem(Item item) {
		this.item = item;
	}

}