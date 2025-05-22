package com.venikovdi.recipient.infra.mapper;

import com.venikovdi.recipient.domain.data.Notice;
import com.venikovdi.recipient.infra.transport.data.NoticeMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface NoticeMessageToNoticeMapper {
    @Mapping(source = "color", target = "color")
    @Mapping(source = "brand", target = "brand")
    @Mapping(source = "number", target = "number")
    Notice map(NoticeMessage noticeMessage);
}
