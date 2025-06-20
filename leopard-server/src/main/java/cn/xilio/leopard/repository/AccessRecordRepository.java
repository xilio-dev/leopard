package cn.xilio.leopard.repository;

import cn.xilio.leopard.adapter.portal.dto.response.StatsResponse;
import cn.xilio.leopard.core.common.page.PageResponse;
import cn.xilio.leopard.domain.dataobject.AccessRecord;
import cn.xilio.leopard.domain.model.DailyStatsDTO;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccessRecordRepository {
    public List<StatsResponse> findStatsCountByType(String shortCode, String type);

    PageResponse<AccessRecord> findAccessRecords(String shortCode, int page, int size);

    AccessRecord saveAccessRecord(AccessRecord record);

    boolean existsByIpAddressAndUserAgent(String shortCode, String ipAddress, String userAgent);

    List<DailyStatsDTO> getDailyAccessStats(String startDate, String endDate, String shortCode);
}
