//    KrOS POS  - Open Source Point Of Sale
//    Copyright (c) 2009-2018 uniCenta & previous Openbravo POS works
//    https://unicenta.com
//
//    This file is part of KrOS POS
//
//    KrOS POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   KrOS POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with KrOS POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.beans;

import java.util.EventObject;

/**
 *
 * @author adrianromero
 * @version 
 */
public class JNumberEvent extends EventObject {

    private char m_cKey;
    
    /**
     *
     * @param source
     * @param cKey
     */
    public JNumberEvent(Object source, char cKey) {
        super(source);
        m_cKey = cKey;
    }
    
    /**
     *
     * @return
     */
    public char getKey() {
        return m_cKey;
    }

}
