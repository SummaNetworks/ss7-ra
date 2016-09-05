/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012. 
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.slee.resource.map.service.mobility.subscriberInformation.wrappers;

import java.util.ArrayList;

import org.mobicents.protocols.ss7.map.api.primitives.IMSI;
import org.mobicents.protocols.ss7.map.api.primitives.ISDNAddressString;
import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.CAMELSubscriptionInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.CallHoldData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.CallWaitingData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ClipData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ClirData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.EctData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ExtCallBarringInfoForCSE;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ExtForwardingInfoForCSE;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.NoteSubscriberDataModifiedRequest;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ODBInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ServingNode;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement.CSGSubscriptionData;
import org.mobicents.slee.resource.map.service.mobility.wrappers.MAPDialogMobilityWrapper;
import org.mobicents.slee.resource.map.service.mobility.wrappers.MobilityMessageWrapper;

/**
 * 
 * @author sergey vetyutnev
 * 
 */
public class NoteSubscriberDataModifiedRequestWrapper extends MobilityMessageWrapper<NoteSubscriberDataModifiedRequest> implements NoteSubscriberDataModifiedRequest {

    private static final String EVENT_TYPE_NAME = "ss7.map.service.mobility.subscriberinfo.PROVIDE_SUBSCRIBER_INFO_REQUEST";

    public NoteSubscriberDataModifiedRequestWrapper(MAPDialogMobilityWrapper mAPDialog, NoteSubscriberDataModifiedRequest req) {
        super(mAPDialog, EVENT_TYPE_NAME, req);
    }

    @Override
    public IMSI getImsi() {
        return this.wrappedEvent.getImsi();
    }

    @Override
    public MAPExtensionContainer getExtensionContainer() {
        return this.wrappedEvent.getExtensionContainer();
    }

    @Override
    public ISDNAddressString getMsisdn() {
        return this.wrappedEvent.getMsisdn();
    }

    @Override
    public ExtForwardingInfoForCSE getForwardingInfoForCSE() {
        return this.wrappedEvent.getForwardingInfoForCSE();
    }

    @Override
    public ExtCallBarringInfoForCSE getCallBarringInfoForCSE() {
        return this.wrappedEvent.getCallBarringInfoForCSE();
    }

    @Override
    public ODBInfo getOdbInfo() {
        return this.wrappedEvent.getOdbInfo();
    }

    @Override
    public CAMELSubscriptionInfo getCamelSubscriptionInfo() {
        return this.wrappedEvent.getCamelSubscriptionInfo();
    }

    @Override
    public boolean getAllInformationSent() {
        return this.wrappedEvent.getAllInformationSent();
    }

    @Override
    public ServingNode getUeReachable() {
        return this.wrappedEvent.getUeReachable();
    }

    @Override
    public ArrayList<CSGSubscriptionData> getCsgSubscriptionDataList() {
        return this.wrappedEvent.getCsgSubscriptionDataList();
    }

    @Override
    public CallWaitingData getCwData() {
        return this.wrappedEvent.getCwData();
    }

    @Override
    public CallHoldData getChData() {
        return this.wrappedEvent.getChData();
    }

    @Override
    public ClipData getClipData() {
        return this.wrappedEvent.getClipData();
    }

    @Override
    public ClirData getClirData() {
        return this.wrappedEvent.getClirData();
    }

    @Override
    public EctData getEctData() {
        return this.wrappedEvent.getEctData();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "NoteSubscriberDataModifiedRequestWrapper [wrapped=" + this.wrappedEvent + "]";
    }

}
