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

import org.json.JSONObject;
import java.util.List;
import io.gs2.consumableItem.Gs2ConsumableItem;
import io.gs2.control.Gs2BasicRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class UpdateItemPoolRequest extends Gs2BasicRequest<UpdateItemPoolRequest> {

	public static class Constant extends Gs2ConsumableItem.Constant {
		public static final String FUNCTION = "UpdateItemPool";
	}

	/** 更新する消費型アイテムプールの名前 */
	private String itemPoolName;

	/** 説明文(1024文字以内) */
	private String description;

	/** サービスクラス */
	private String serviceClass;

	/** アイテム入手時 に実行されるGS2-Script */
	private String acquisitionInventoryTriggerScript;

	/** アイテム入手完了時 に実行されるGS2-Script */
	private String acquisitionInventoryDoneTriggerScript;

	/** アイテム消費時 に実行されるGS2-Script */
	private String consumeInventoryTriggerScript;

	/** アイテム消費完了時 に実行されるGS2-Script */
	private String consumeInventoryDoneTriggerScript;


	/**
	 * 更新する消費型アイテムプールの名前を取得
	 *
	 * @return 更新する消費型アイテムプールの名前
	 */
	public String getItemPoolName() {
		return itemPoolName;
	}

	/**
	 * 更新する消費型アイテムプールの名前を設定
	 *
	 * @param itemPoolName 更新する消費型アイテムプールの名前
	 */
	public void setItemPoolName(String itemPoolName) {
		this.itemPoolName = itemPoolName;
	}

	/**
	 * 更新する消費型アイテムプールの名前を設定
	 *
	 * @param itemPoolName 更新する消費型アイテムプールの名前
	 * @return this
	 */
	public UpdateItemPoolRequest withItemPoolName(String itemPoolName) {
		setItemPoolName(itemPoolName);
		return this;
	}

	/**
	 * 説明文(1024文字以内)を取得
	 *
	 * @return 説明文(1024文字以内)
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 説明文(1024文字以内)を設定
	 *
	 * @param description 説明文(1024文字以内)
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 説明文(1024文字以内)を設定
	 *
	 * @param description 説明文(1024文字以内)
	 * @return this
	 */
	public UpdateItemPoolRequest withDescription(String description) {
		setDescription(description);
		return this;
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
	 * サービスクラスを設定
	 *
	 * @param serviceClass サービスクラス
	 * @return this
	 */
	public UpdateItemPoolRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
		return this;
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
	 * アイテム入手時 に実行されるGS2-Scriptを設定
	 *
	 * @param acquisitionInventoryTriggerScript アイテム入手時 に実行されるGS2-Script
	 * @return this
	 */
	public UpdateItemPoolRequest withAcquisitionInventoryTriggerScript(String acquisitionInventoryTriggerScript) {
		setAcquisitionInventoryTriggerScript(acquisitionInventoryTriggerScript);
		return this;
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
	 * アイテム入手完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param acquisitionInventoryDoneTriggerScript アイテム入手完了時 に実行されるGS2-Script
	 * @return this
	 */
	public UpdateItemPoolRequest withAcquisitionInventoryDoneTriggerScript(String acquisitionInventoryDoneTriggerScript) {
		setAcquisitionInventoryDoneTriggerScript(acquisitionInventoryDoneTriggerScript);
		return this;
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

	/**
	 * アイテム消費時 に実行されるGS2-Scriptを設定
	 *
	 * @param consumeInventoryTriggerScript アイテム消費時 に実行されるGS2-Script
	 * @return this
	 */
	public UpdateItemPoolRequest withConsumeInventoryTriggerScript(String consumeInventoryTriggerScript) {
		setConsumeInventoryTriggerScript(consumeInventoryTriggerScript);
		return this;
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
	 * アイテム消費完了時 に実行されるGS2-Scriptを設定
	 *
	 * @param consumeInventoryDoneTriggerScript アイテム消費完了時 に実行されるGS2-Script
	 * @return this
	 */
	public UpdateItemPoolRequest withConsumeInventoryDoneTriggerScript(String consumeInventoryDoneTriggerScript) {
		setConsumeInventoryDoneTriggerScript(consumeInventoryDoneTriggerScript);
		return this;
	}

}