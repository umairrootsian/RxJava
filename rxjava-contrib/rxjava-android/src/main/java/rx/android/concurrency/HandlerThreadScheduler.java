/**
 * Copyright 2014 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rx.android.concurrency;

import android.os.Handler;

/**
 * Deprecated. Package changed from rx.android.concurrency to rx.android.schedulers.
 * 
 * @deprecated Use {@link rx.android.schedulers.HandlerThreadScheduler} instead. This will be removed before 1.0 release.
 */
@Deprecated
public class HandlerThreadScheduler extends rx.android.schedulers.HandlerThreadScheduler {

    public HandlerThreadScheduler(Handler handler) {
        super(handler);
    }

}
