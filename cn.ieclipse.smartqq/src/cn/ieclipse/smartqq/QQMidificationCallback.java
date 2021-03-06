/*
 * Copyright 2014-2017 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.smartqq;

import com.scienjus.smartqq.model.QQContact;
import com.scienjus.smartqq.model.Recent;

import cn.ieclipse.smartim.callback.ModificationCallback;
import cn.ieclipse.smartim.model.IContact;
import cn.ieclipse.smartqq.views.QQContactView;

/**
 * 类/接口描述
 * 
 * @author Jamling
 * @date 2017年10月26日
 *       
 */
public class QQMidificationCallback implements ModificationCallback {
    QQContactView fContactView;
    
    public QQMidificationCallback(QQContactView view) {
        this.fContactView = view;
    }
    
    @Override
    public void onContactChanged(IContact contact) {
        if (contact instanceof Recent || contact instanceof QQContact) {
            fContactView.notifyUpdateContacts(0, true);
        }
    }
    
}
