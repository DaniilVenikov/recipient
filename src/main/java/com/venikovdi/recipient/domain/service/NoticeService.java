package com.venikovdi.recipient.domain.service;

import com.venikovdi.recipient.domain.data.Notice;
import com.venikovdi.recipient.infra.repository.service.NoticeEntityService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NoticeService {
    private final NoticeEntityService noticeEntityService;

    public void createNotice(Notice notice) {
        noticeEntityService.createNotice(notice);
    }
}
