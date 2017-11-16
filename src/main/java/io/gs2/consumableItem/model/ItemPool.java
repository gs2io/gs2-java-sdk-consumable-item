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
 * 消費型アイテムプール
 *
 * @author Game Server Services, Inc.
 *
 */
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ItemPool implements Serializable {

	/** アイテム入手完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
 */
	private String acquisitionInventoryDoneTriggerScript;

	/** 消費型アイテムプール名 */
	private String name;

	/** 消費型アイテムプールID */
	private String itemPoolId;

	/** サービスクラス */
	private String serviceClass;

	/** アイテム入手時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
 */
	private String acquisitionInventoryTriggerScript;

	/** 作成日時(エポック秒) */
	private Integer createAt;

	/** オーナーID */
	private String ownerId;

	/** 最終更新日時(エポック秒) */
	private Integer updateAt;

	/** アイテム消費完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
 */
	private String consumeInventoryDoneTriggerScript;

	/** アイテム消費時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
 */
	private String consumeInventoryTriggerScript;

	/** 説明文 */
	private String description;


	/**
	 * アイテム入手完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を取得
	 *
	 * @return アイテム入手完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

	 */
	public String getAcquisitionInventoryDoneTriggerScript() {
		return acquisitionInventoryDoneTriggerScript;
	}

	/**
	 * アイテム入手完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を設定
	 *
	 * @param acquisitionInventoryDoneTriggerScript アイテム入手完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

	 */
	public void setAcquisitionInventoryDoneTriggerScript(String acquisitionInventoryDoneTriggerScript) {
		this.acquisitionInventoryDoneTriggerScript = acquisitionInventoryDoneTriggerScript;
	}

	/**
	 * 消費型アイテムプール名を取得
	 *
	 * @return 消費型アイテムプール名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 消費型アイテムプール名を設定
	 *
	 * @param name 消費型アイテムプール名
	 */
	public void setName(String name) {
		this.name = name;
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
	 * サービスクラスを取得
	 *
	 * @return サービスクラス
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * サービスクラスを設定
	 *
	 * @param serviceClass サービスクラス
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

	/**
	 * アイテム入手時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を取得
	 *
	 * @return アイテム入手時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

	 */
	public String getAcquisitionInventoryTriggerScript() {
		return acquisitionInventoryTriggerScript;
	}

	/**
	 * アイテム入手時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を設定
	 *
	 * @param acquisitionInventoryTriggerScript アイテム入手時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

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
	 * オーナーIDを取得
	 *
	 * @return オーナーID
	 */
	public String getOwnerId() {
		return ownerId;
	}

	/**
	 * オーナーIDを設定
	 *
	 * @param ownerId オーナーID
	 */
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
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
	 * アイテム消費完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を取得
	 *
	 * @return アイテム消費完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

	 */
	public String getConsumeInventoryDoneTriggerScript() {
		return consumeInventoryDoneTriggerScript;
	}

	/**
	 * アイテム消費完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を設定
	 *
	 * @param consumeInventoryDoneTriggerScript アイテム消費完了時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

	 */
	public void setConsumeInventoryDoneTriggerScript(String consumeInventoryDoneTriggerScript) {
		this.consumeInventoryDoneTriggerScript = consumeInventoryDoneTriggerScript;
	}

	/**
	 * アイテム消費時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を取得
	 *
	 * @return アイテム消費時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

	 */
	public String getConsumeInventoryTriggerScript() {
		return consumeInventoryTriggerScript;
	}

	/**
	 * アイテム消費時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます
を設定
	 *
	 * @param consumeInventoryTriggerScript アイテム消費時 に実行されるGS2-Script
Item に設定がある場合はそちらが優先されます

	 */
	public void setConsumeInventoryTriggerScript(String consumeInventoryTriggerScript) {
		this.consumeInventoryTriggerScript = consumeInventoryTriggerScript;
	}

	/**
	 * 説明文を取得
	 *
	 * @return 説明文
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 説明文を設定
	 *
	 * @param description 説明文
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}