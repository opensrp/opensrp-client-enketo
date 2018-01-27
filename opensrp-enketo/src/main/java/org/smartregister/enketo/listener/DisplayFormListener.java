package org.smartregister.enketo.listener;

import org.json.JSONObject;

/**
 * Created by keyman on 18/10/2017.
 */
public interface DisplayFormListener {

    void saveFormSubmission(String formSubmision, String id, String formName, JSONObject
            fieldOverrides);


    void savePartialFormData(String formData, String id, String formName, JSONObject
            fieldOverrides);

    void onFormClosed(String recordId, String formName);
}
