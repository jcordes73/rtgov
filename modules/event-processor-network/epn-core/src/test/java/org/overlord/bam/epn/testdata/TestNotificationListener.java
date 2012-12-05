/*
 * JBoss, Home of Professional Open Source
 * Copyright 2008-11, Red Hat Middleware LLC, and others contributors as indicated
 * by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 */
package org.overlord.bam.epn.testdata;

import org.overlord.bam.epn.EventList;
import org.overlord.bam.epn.NotificationListener;

public class TestNotificationListener implements NotificationListener {

    private java.util.List<Entry> _entries=new java.util.Vector<Entry>();
    
    public void notify(String subject, EventList events) {
        _entries.add(new Entry(subject,events));
    }

    public java.util.List<Entry> getEntries() {
        return (_entries);
    }
    
    public class Entry {
        private String _subject=null;
        private EventList _events=null;
        
        public Entry(String subject, EventList events) {
            _subject = subject;
             _events = events;
        }
        
        public String getSubject() {
            return (_subject);
        }
        
        public EventList getEvents() {
            return(_events);
        }
    }
}
