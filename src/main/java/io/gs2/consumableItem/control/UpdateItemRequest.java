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
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class UpdateItemRequest extends Gs2BasicRequest<UpdateItemRequest> {

	public static class Constant extends Gs2ConsumableItem.Constant {
		public static final String FUNCTION = "UpdateItem";
	}

	/** 消費型アイテムプールの名前 */
	String itemPoolName;

	/** 消費型アイテムの名前 */
	String itemName;

	/** 最大所持数。
0を指定するか省略すると制限無しで所持可能 */
	Integer max;


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
	public UpdateItemRequest withItemPoolName(String itemPoolName) {
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
	public UpdateItemRequest withItemName(String itemName) {
		setItemName(itemName);
		return this;
	}

	/**
	 * 最大所持数。
0を指定するか省略すると制限無しで所持可能を取得
	 *
	 * @return 最大所持数。
0を指定するか省略すると制限無しで所持可能
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * 最大所持数。
0を指定するか省略すると制限無しで所持可能を設定
	 *
	 * @param max 最大所持数。
0を指定するか省略すると制限無しで所持可能
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	/**
	 * 最大所持数。
0を指定するか省略すると制限無しで所持可能を設定
	 *
	 * @param max 最大所持数。
0を指定するか省略すると制限無しで所持可能
	 * @return this
	 */
	public UpdateItemRequest withMax(Integer max) {
		setMax(max);
		return this;
	}

}