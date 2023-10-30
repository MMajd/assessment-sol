package com.stc.system.adapter.in.web.service.imp;

import com.stc.system.adapter.in.web.dto.AddSpaceDto;
import com.stc.system.adapter.in.web.service.AddSpaceWebService;
import com.stc.system.application.port.in.AddSpaceUseCase;
import com.stc.system.common.WebService;
import com.stc.system.application.port.in.AddSpaceUseCase.AddSpaceCommand;

import lombok.RequiredArgsConstructor;

@WebService
@RequiredArgsConstructor
public class SpaceWebServiceImpl implements AddSpaceWebService {
    private final AddSpaceUseCase addSpaceUseCase;

    @Override
    public void addSpace(AddSpaceDto addSpaceDto) {
        addSpaceUseCase.addSpace(
                new AddSpaceCommand(addSpaceDto.permissionGroupName(), addSpaceDto.spaceName()));
    }
}
