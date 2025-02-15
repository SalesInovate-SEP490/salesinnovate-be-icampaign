package fpt.capstone.iCampaign.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class PageResponse<T> implements Serializable {
    private int page;
    private int size;
    private int totalPage;
    private long total;
    private T items;
}

