package com.venikovdi.recipient.infra.mapper;

import com.venikovdi.recipient.domain.data.Notice;
import com.venikovdi.recipient.infra.repository.entity.NoticeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface NoticeToNoticeEntityMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(source = "color", target = "color")
    @Mapping(source = "brand", target = "brand")
    @Mapping(source = "number", target = "number")
    NoticeEntity map(Notice notice);
}
