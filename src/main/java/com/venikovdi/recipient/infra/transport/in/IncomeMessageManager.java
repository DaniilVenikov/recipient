package com.venikovdi.recipient.infra.transport.in;

import com.venikovdi.recipient.domain.data.Notice;
import com.venikovdi.recipient.domain.service.NoticeService;
import com.venikovdi.recipient.infra.mapper.NoticeMessageToNoticeMapper;
import com.venikovdi.recipient.infra.transport.data.NoticeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class IncomeMessageManager {
    private final NoticeService noticeService;
    private final NoticeMessageToNoticeMapper noticeMapper;

    public void processNotice(NoticeMessage noticeMessage) {
        Notice notice = noticeMapper.map(noticeMessage);
        noticeService.createNotice(notice);
    }
}
