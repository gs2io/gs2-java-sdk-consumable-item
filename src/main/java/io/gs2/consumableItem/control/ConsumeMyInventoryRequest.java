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

import io.gs2.consumableItem.Gs2ConsumableItem;
import io.gs2.control.Gs2UserRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class ConsumeMyInventoryRequest extends Gs2UserRequest<ConsumeMyInventoryRequest> {

	public static class Constant extends Gs2ConsumableItem.Constant {
		public static final String FUNCTION = "ConsumeMyInventory";
	}

	/** 消費型アイテムプールの名前 */
	String itemPoolName;

	/** 消費型アイテムの名前 */
	String itemName;

	/** 消費数量 */
	Integer count;


	/**
	 * 消費型アイテムプールの名前を取得
	 *
	 * @return 消費型アイテムプールの名前
	 */
	public String getItemPoolName() {
		return itemPoolName;
	}

	/**
	 * 消費型アイテムプールの名前を設定
	 *
	 * @param itemPoolName 消費型アイテムプールの名前
	 */
	public void setItemPoolName(String itemPoolName) {
		this.itemPoolName = itemPoolName;
	}

	/**
	 * 消費型アイテムプールの名前を設定
	 *
	 * @param itemPoolName 消費型アイテムプールの名前
	 * @return this
	 */
	public ConsumeMyInventoryRequest withItemPoolName(String itemPoolName) {
		setItemPoolName(itemPoolName);
		return this;
	}

	/**
	 * 消費型アイテムの名前を取得
	 *
	 * @return 消費型アイテムの名前
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * 消費型アイテムの名前を設定
	 *
	 * @param itemName 消費型アイテムの名前
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * 消費型アイテムの名前を設定
	 *
	 * @param itemName 消費型アイテムの名前
	 * @return this
	 */
	public ConsumeMyInventoryRequest withItemName(String itemName) {
		setItemName(itemName);
		return this;
	}

	/**
	 * 消費数量を取得
	 *
	 * @return 消費数量
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * 消費数量を設定
	 *
	 * @param count 消費数量
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * 消費数量を設定
	 *
	 * @param count 消費数量
	 * @return this
	 */
	public ConsumeMyInventoryRequest withCount(Integer count) {
		setCount(count);
		return this;
	}

}