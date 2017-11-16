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
public class CreateItemPoolRequest extends Gs2BasicRequest<CreateItemPoolRequest> {

	public static class Constant extends Gs2ConsumableItem.Constant {
		public static final String FUNCTION = "CreateItemPool";
	}

	/** アイテム入手完了時 に実行されるGS2-Script */
	private String acquisitionInventoryDoneTriggerScript;

	/** 仮想通貨名 */
	private String name;

	/** アイテム入手時 に実行されるGS2-Script */
	private String acquisitionInventoryTriggerScript;

	/** アイテム消費完了時 に実行されるGS2-Script */
	private String consumeInventoryDoneTriggerScript;

	/** サービスクラス */
	private String serviceClass;

	/** アイテム消費時 に実行されるGS2-Script */
	private String consumeInventoryTriggerScript;

	/** 説明文(1024文字以内) */
	private String description;


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
	public CreateItemPoolRequest withAcquisitionInventoryDoneTriggerScript(String acquisitionInventoryDoneTriggerScript) {
		setAcquisitionInventoryDoneTriggerScript(acquisitionInventoryDoneTriggerScript);
		return this;
	}

	/**
	 * 仮想通貨名を取得
	 *
	 * @return 仮想通貨名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 仮想通貨名を設定
	 *
	 * @param name 仮想通貨名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 仮想通貨名を設定
	 *
	 * @param name 仮想通貨名
	 * @return this
	 */
	public CreateItemPoolRequest withName(String name) {
		setName(name);
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
	public CreateItemPoolRequest withAcquisitionInventoryTriggerScript(String acquisitionInventoryTriggerScript) {
		setAcquisitionInventoryTriggerScript(acquisitionInventoryTriggerScript);
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
	public CreateItemPoolRequest withConsumeInventoryDoneTriggerScript(String consumeInventoryDoneTriggerScript) {
		setConsumeInventoryDoneTriggerScript(consumeInventoryDoneTriggerScript);
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
	public CreateItemPoolRequest withServiceClass(String serviceClass) {
		setServiceClass(serviceClass);
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
	public CreateItemPoolRequest withConsumeInventoryTriggerScript(String consumeInventoryTriggerScript) {
		setConsumeInventoryTriggerScript(consumeInventoryTriggerScript);
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
	public CreateItemPoolRequest withDescription(String description) {
		setDescription(description);
		return this;
	}

}