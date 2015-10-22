/*******************************************************************************
 * Copyright (c) 2015 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.contacts.shared.module.events.event;

import java.util.Date;

import javax.annotation.Generated;

import org.eclipse.scout.contacts.shared.template.AbstractAddressBoxData;
import org.eclipse.scout.contacts.shared.template.AbstractEmailFieldData;
import org.eclipse.scout.contacts.shared.template.AbstractPhoneFieldData;
import org.eclipse.scout.rt.shared.data.basic.table.AbstractTableRowData;
import org.eclipse.scout.rt.shared.data.form.AbstractFormData;
import org.eclipse.scout.rt.shared.data.form.fields.AbstractValueFieldData;
import org.eclipse.scout.rt.shared.data.form.fields.tablefield.AbstractTableFieldBeanData;
import org.eclipse.scout.rt.shared.data.form.properties.AbstractPropertyData;

/**
 * <b>NOTE:</b><br>
 * This class is auto generated by the Scout SDK. No manual modifications recommended.
 */
@Generated(value = "org.eclipse.scout.contacts.client.module.events.event.EventForm", comments = "This class is auto generated by the Scout SDK. No manual modifications recommended.")
public class EventFormData extends AbstractFormData {

  private static final long serialVersionUID = 1L;

  public EventFormData() {
  }

  public Comments getComments() {
    return getFieldByClass(Comments.class);
  }

  public Email getEmail() {
    return getFieldByClass(Email.class);
  }

  public Ends getEnds() {
    return getFieldByClass(Ends.class);
  }

  /**
   * access method for property EventId.
   */
  public String getEventId() {
    return getEventIdProperty().getValue();
  }

  /**
   * access method for property EventId.
   */
  public void setEventId(String eventId) {
    getEventIdProperty().setValue(eventId);
  }

  public EventIdProperty getEventIdProperty() {
    return getPropertyByClass(EventIdProperty.class);
  }

  public Homepage getHomepage() {
    return getFieldByClass(Homepage.class);
  }

  public LocationBox getLocationBox() {
    return getFieldByClass(LocationBox.class);
  }

  public ParticipantTableField getParticipantTableField() {
    return getFieldByClass(ParticipantTableField.class);
  }

  public Phone getPhone() {
    return getFieldByClass(Phone.class);
  }

  public Starts getStarts() {
    return getFieldByClass(Starts.class);
  }

  public Title getTitle() {
    return getFieldByClass(Title.class);
  }

  public static class Comments extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Comments() {
    }
  }

  public static class Email extends AbstractEmailFieldData {

    private static final long serialVersionUID = 1L;

    public Email() {
    }
  }

  public static class Ends extends AbstractValueFieldData<Date> {

    private static final long serialVersionUID = 1L;

    public Ends() {
    }
  }

  public static class EventIdProperty extends AbstractPropertyData<String> {

    private static final long serialVersionUID = 1L;

    public EventIdProperty() {
    }
  }

  public static class Homepage extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Homepage() {
    }
  }

  public static class LocationBox extends AbstractAddressBoxData {

    private static final long serialVersionUID = 1L;

    public LocationBox() {
    }
  }

  public static class ParticipantTableField extends AbstractTableFieldBeanData {

    private static final long serialVersionUID = 1L;

    public ParticipantTableField() {
    }

    @Override
    public ParticipantTableFieldRowData addRow() {
      return (ParticipantTableFieldRowData) super.addRow();
    }

    @Override
    public ParticipantTableFieldRowData addRow(int rowState) {
      return (ParticipantTableFieldRowData) super.addRow(rowState);
    }

    @Override
    public ParticipantTableFieldRowData createRow() {
      return new ParticipantTableFieldRowData();
    }

    @Override
    public Class<? extends AbstractTableRowData> getRowType() {
      return ParticipantTableFieldRowData.class;
    }

    @Override
    public ParticipantTableFieldRowData[] getRows() {
      return (ParticipantTableFieldRowData[]) super.getRows();
    }

    @Override
    public ParticipantTableFieldRowData rowAt(int index) {
      return (ParticipantTableFieldRowData) super.rowAt(index);
    }

    public void setRows(ParticipantTableFieldRowData[] rows) {
      super.setRows(rows);
    }

    public static class ParticipantTableFieldRowData extends AbstractTableRowData {

      private static final long serialVersionUID = 1L;
      public static final String personId = "personId";
      public static final String firstName = "firstName";
      public static final String lastName = "lastName";
      public static final String organization = "organization";
      private String m_personId;
      private String m_firstName;
      private String m_lastName;
      private String m_organization;

      public ParticipantTableFieldRowData() {
      }

      public String getPersonId() {
        return m_personId;
      }

      public void setPersonId(String personId) {
        m_personId = personId;
      }

      public String getFirstName() {
        return m_firstName;
      }

      public void setFirstName(String firstName) {
        m_firstName = firstName;
      }

      public String getLastName() {
        return m_lastName;
      }

      public void setLastName(String lastName) {
        m_lastName = lastName;
      }

      public String getOrganization() {
        return m_organization;
      }

      public void setOrganization(String organization) {
        m_organization = organization;
      }
    }
  }

  public static class Phone extends AbstractPhoneFieldData {

    private static final long serialVersionUID = 1L;

    public Phone() {
    }
  }

  public static class Starts extends AbstractValueFieldData<Date> {

    private static final long serialVersionUID = 1L;

    public Starts() {
    }
  }

  public static class Title extends AbstractValueFieldData<String> {

    private static final long serialVersionUID = 1L;

    public Title() {
    }
  }
}
