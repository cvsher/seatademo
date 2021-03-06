package com.oujh.seatetest.seatademo.feign.api;

import com.oujh.seatetest.seatademo.feign.dto.StorageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther oujh5
 * @Date 2020-8-20
 */
@RequestMapping("/storage")
@FeignClient(value="storage-service")
public interface StorageFeignApi {

    @GetMapping("/reduce")
    public StorageDto reduceStorage(@RequestParam("storageId") Integer storageId);

}
