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

package io.gs2.consumableItem.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 消費型アイテム
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Item implements Serializable {

	/** 消費型アイテムID */
	private String itemId;

	/** アイテム入手完了時 に実行されるGS2-Script */
	private String acquisitionInventoryDoneTriggerScript;

	/** 消費型アイテム名 */
	private String name;

	/** 所持数の上限 */
	private Integer max;

	/** 消費型アイテムプールID */
	private String itemPoolId;

	/** アイテム入手時 に実行されるGS2-Script */
	private String acquisitionInventoryTriggerScript;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;

	/** アイテム消費完了時 に実行されるGS2-Script */
	private String consumeInventoryDoneTriggerScript;

	/** アイテム消費時 に実行されるGS2-Script */
	private String consumeInventoryTriggerScript;


	/**
	 * 消費型アイテムIDを取得
	 *
	 * @return 消費型アイテムID
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * 消費型アイテムIDを設定
	 *
	 * @param itemId 消費型アイテムID
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * アイテム入手完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return アイテム入手完了時 に実行されるGS2-Script
	 */
	public String getAcquisitionInventoryDoneTriggerScript() {
		return acquisitionInventoryDoneTriggerScript;
	}

	/**
	 * アイテム入手完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param acquisitionInventoryDoneTriggerScript アイテム入手完了時 に実行されるGS2-Script
	 */
	public void setAcquisitionInventoryDoneTriggerScript(String acquisitionInventoryDoneTriggerScript) {
		this.acquisitionInventoryDoneTriggerScript = acquisitionInventoryDoneTriggerScript;
	}

	/**
	 * 消費型アイテム名を取得
	 *
	 * @return 消費型アイテム名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 消費型アイテム名を設定
	 *
	 * @param name 消費型アイテム名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 所持数の上限を取得
	 *
	 * @return 所持数の上限
	 */
	public Integer getMax() {
		return max;
	}

	/**
	 * 所持数の上限を設定
	 *
	 * @param max 所持数の上限
	 */
	public void setMax(Integer max) {
		this.max = max;
	}

	/**
	 * 消費型アイテムプールIDを取得
	 *
	 * @return 消費型アイテムプールID
	 */
	public String getItemPoolId() {
		return itemPoolId;
	}

	/**
	 * 消費型アイテムプールIDを設定
	 *
	 * @param itemPoolId 消費型アイテムプールID
	 */
	public void setItemPoolId(String itemPoolId) {
		this.itemPoolId = itemPoolId;
	}

	/**
	 * アイテム入手時 に実行されるGS2-Scriptを取得
	 *
	 * @return アイテム入手時 に実行されるGS2-Script
	 */
	public String getAcquisitionInventoryTriggerScript() {
		return acquisitionInventoryTriggerScript;
	}

	/**
	 * アイテム入手時 に実行されるGS2-Scriptを設定
	 *
	 * @param acquisitionInventoryTriggerScript アイテム入手時 に実行されるGS2-Script
	 */
	public void setAcquisitionInventoryTriggerScript(String acquisitionInventoryTriggerScript) {
		this.acquisitionInventoryTriggerScript = acquisitionInventoryTriggerScript;
	}

	/**
	 * 作成日時(エポック秒)を取得
	 *
	 * @return 作成日時(エポック秒)
	 */
	public Integer getCreateAt() {
		return createAt;
	}

	/**
	 * 作成日時(エポック秒)を設定
	 *
	 * @param createAt 作成日時(エポック秒)
	 */
	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	/**
	 * 最終更新日時(エポック秒)を取得
	 *
	 * @return 最終更新日時(エポック秒)
	 */
	public Integer getUpdateAt() {
		return updateAt;
	}

	/**
	 * 最終更新日時(エポック秒)を設定
	 *
	 * @param updateAt 最終更新日時(エポック秒)
	 */
	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

	/**
	 * アイテム消費完了時 に実行されるGS2-Scriptを取得
	 *
	 * @return アイテム消費完了時 に実行されるGS2-Script
	 */
	public String getConsumeInventoryDoneTriggerScript() {
		return consumeInventoryDoneTriggerScript;
	}

	/**
	 * アイテム消費完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param consumeInventoryDoneTriggerScript アイテム消費完了時 に実行されるGS2-Script
	 */
	public void setConsumeInventoryDoneTriggerScript(String consumeInventoryDoneTriggerScript) {
		this.consumeInventoryDoneTriggerScript = consumeInventoryDoneTriggerScript;
	}

	/**
	 * アイテム消費時 に実行されるGS2-Scriptを取得
	 *
	 * @return アイテム消費時 に実行されるGS2-Script
	 */
	public String getConsumeInventoryTriggerScript() {
		return consumeInventoryTriggerScript;
	}

	/**
	 * アイテム消費時 に実行されるGS2-Scriptを設定
	 *
	 * @param consumeInventoryTriggerScript アイテム消費時 に実行されるGS2-Script
	 */
	public void setConsumeInventoryTriggerScript(String consumeInventoryTriggerScript) {
		this.consumeInventoryTriggerScript = consumeInventoryTriggerScript;
	}

}