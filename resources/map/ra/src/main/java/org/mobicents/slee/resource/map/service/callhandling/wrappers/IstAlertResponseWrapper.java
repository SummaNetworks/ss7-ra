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

package org.mobicents.slee.resource.map.service.callhandling.wrappers;

import org.mobicents.protocols.ss7.map.api.primitives.MAPExtensionContainer;
import org.mobicents.protocols.ss7.map.api.service.callhandling.CallTerminationIndicator;
import org.mobicents.protocols.ss7.map.api.service.callhandling.IstAlertResponse;

/**
 * 
 * @author sergey vetyutnev
 * 
 */
public class IstAlertResponseWrapper extends CallHandlingMessageWrapper<IstAlertResponse> implements IstAlertResponse {

    private static final String EVENT_TYPE_NAME = "ss7.map.service.callhandling.IST_ALERT_RESPONSE";

    /**
     * @param mapDialog
     */
    public IstAlertResponseWrapper(MAPDialogCallHandlingWrapper mapDialog, IstAlertResponse req) {
        super(mapDialog, EVENT_TYPE_NAME, req);
    }

    @Override
    public Integer getIstAlertTimer() {
        return this.wrappedEvent.getIstAlertTimer();
    }

    @Override
    public boolean getIstInformationWithdraw() {
        return this.wrappedEvent.getIstInformationWithdraw();
    }

    @Override
    public CallTerminationIndicator getCallTerminationIndicator() {
        return this.wrappedEvent.getCallTerminationIndicator();
    }

    @Override
    public MAPExtensionContainer getExtensionContainer() {
        return this.wrappedEvent.getExtensionContainer();
    }

    @Override
    public String toString() {
        return "IstAlertResponseWrapper [wrapped=" + this.wrappedEvent + "]";
    }

}
