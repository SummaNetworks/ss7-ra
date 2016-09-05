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

import org.mobicents.protocols.ss7.map.api.primitives.ISDNAddressString;
import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;
import org.mobicents.protocols.ss7.map.api.primitives.SubscriberIdentity;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.AnyTimeModificationRequest;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCBInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCFInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCHInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCLIPInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCLIRInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCSG;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCSI;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForCWInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForECTInfo;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForIPSMGWData;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.ModificationRequestForODBdata;
import org.mobicents.protocols.ss7.map.api.service.mobility.subscriberInformation.RequestedServingNode;
import org.mobicents.slee.resource.map.service.mobility.wrappers.MAPDialogMobilityWrapper;
import org.mobicents.slee.resource.map.service.mobility.wrappers.MobilityMessageWrapper;

/**
 * 
 * @author amit bhayani
 * 
 */
public class AnyTimeModificationRequestWrapper extends MobilityMessageWrapper<AnyTimeModificationRequest> implements
		AnyTimeModificationRequest {

	private static final String EVENT_TYPE_NAME = "ss7.map.service.mobility.subscriberinfo.ANY_TIME_MODIFICATION_REQUEST";

	/**
	 * @param mAPDialog
	 */
	public AnyTimeModificationRequestWrapper(MAPDialogMobilityWrapper mAPDialog, AnyTimeModificationRequest req) {
		super(mAPDialog, EVENT_TYPE_NAME, req);
	}

	public MAPExtensionContainer getExtensionContainer() {
		return this.wrappedEvent.getExtensionContainer();
	}

	@Override
	public boolean getLongFTNSupported() {
		return this.wrappedEvent.getLongFTNSupported();
	}

	@Override
	public ModificationRequestForODBdata getModificationRequestForODBdata() {
		return this.wrappedEvent.getModificationRequestForODBdata();
	}

	@Override
	public ModificationRequestForIPSMGWData getModificationRequestForIpSmGwData() {
		return this.wrappedEvent.getModificationRequestForIpSmGwData();
	}

	@Override
	public RequestedServingNode getActivationRequestForUEReachability() {
		return this.wrappedEvent.getActivationRequestForUEReachability();
	}

	@Override
	public ModificationRequestForCSG getModificationRequestForCSG() {
		return this.wrappedEvent.getModificationRequestForCSG();
	}

	@Override
	public ModificationRequestForCWInfo getModificationRequestForCwData() {
		return this.wrappedEvent.getModificationRequestForCwData();
	}

	@Override
	public ModificationRequestForCLIPInfo getModificationRequestForClipData() {
		return this.wrappedEvent.getModificationRequestForClipData();
	}

	@Override
	public ModificationRequestForCLIRInfo getModificationRequestForClirData() {
		return this.wrappedEvent.getModificationRequestForClirData();
	}

	@Override
	public ModificationRequestForCHInfo getModificationRequestForHoldData() {
		return this.wrappedEvent.getModificationRequestForHoldData();
	}

	@Override
	public ModificationRequestForECTInfo getModificationRequestForEctData() {
		return this.wrappedEvent.getModificationRequestForEctData();
	}

	public ISDNAddressString getGsmSCFAddress() {
		return this.wrappedEvent.getGsmSCFAddress();
	}

	@Override
	public ModificationRequestForCFInfo getModificationRequestForCfInfo() {
		return this.wrappedEvent.getModificationRequestForCfInfo();
	}

	@Override
	public ModificationRequestForCBInfo getModificationRequestForCbInfo() {
		return this.wrappedEvent.getModificationRequestForCbInfo();
	}

	@Override
	public ModificationRequestForCSI getModificationRequestForCSI() {
		return this.wrappedEvent.getModificationRequestForCSI();
	}

	public SubscriberIdentity getSubscriberIdentity() {
		return this.wrappedEvent.getSubscriberIdentity();
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AnyTimeModificationRequestWrapper [wrapped=" + this.wrappedEvent + "]";
	}

}
