package com.venikovdi.recipient.infra.repository.service;

import com.venikovdi.recipient.domain.data.Notice;
import com.venikovdi.recipient.infra.mapper.NoticeToNoticeEntityMapper;
import com.venikovdi.recipient.infra.repository.NoticeRepository;
import com.venikovdi.recipient.infra.repository.entity.NoticeEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class NoticeEntityService {

    private final NoticeRepository noticeRepository;
    private final NoticeToNoticeEntityMapper noticeEntityMapper;

    public void createNotice(Notice notice) {
        NoticeEntity entity = noticeEntityMapper.map(notice);
        log.info("Save in repository: {}", entity.toString());
        noticeRepository.save(entity);
    }
}
