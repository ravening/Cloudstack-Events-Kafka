package com.rakeshv.kafkaelasticsearchconnector;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloudstackMessage {
    @Id
    private String id;
    @Field(name = "@timestamp", type = FieldType.Date, format = DateFormat.date_time, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private Date timestamp;
    private String eventDateTime;
    private String description;
    private String event;
    private String user;
    private String account;
    private String status;
    private String entity;
    private String commandEventType;
    private String jobId;
    private String instanceUuid;
    @JsonProperty("old-state")
    private String oldState;
    @JsonProperty("new-state")
    private String newState;
    private String resource;
    private String zone;
    private String subject;
    private String body;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String space = ", ";
        if (timestamp != null) {
            sb.append("Timestamp=").append(timestamp).append(space);
        }
        if (description != null && !description.equals("")) {
            sb.append("description=").append(description).append(space);
        }
        if (event != null && !event.equals("")) {
            sb.append("event=").append(event).append(space);
        }
        if (status != null && !status.equals("")) {
            sb.append("status=").append(status).append(space);
        }
        if (entity != null && !entity.equals("")) {
            sb.append("entity=").append(entity).append(space);
        }
        if (commandEventType != null && !commandEventType.equals("")) {
            sb.append("Command=").append(commandEventType).append(space);
        }
        if (jobId != null && !jobId.equals("")) {
            sb.append("Jobid=").append(jobId).append(space);
        }
        if (instanceUuid != null && !instanceUuid.equals("")) {
            sb.append("Instance uuid=").append(instanceUuid).append(space);
        }
        if (oldState != null && !oldState.equals("")) {
            sb.append("Old state=").append(oldState).append(space);
        }
        if (newState != null && !newState.equals("")) {
            sb.append("New state=").append(newState).append(space);
        }
        if (resource != null && !resource.equals("")) {
            sb.append("Resource =").append(resource).append(space);
        }
        if (zone!= null && !zone.equals("")) {
            sb.append("Zone=").append(zone).append(space);
        }
        if (account != null && !account.equals("")) {
            sb.append("Account=").append(account).append(space);
        }
        if (user != null && !user.equals("")) {
            sb.append("User=").append(user).append(space);
        }
        if (subject != null && !subject.equals("")) {
            sb.append("Subject=").append(subject).append(space);
        }
        if (body!= null && !body.equals("")) {
            sb.append("Body=").append(body).append(space);
        }

        return sb.toString();
    }
}
