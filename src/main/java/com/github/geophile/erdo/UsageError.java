/*
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package com.github.geophile.erdo;

/**
 * Error in configuration or other usage.
 */

public class UsageError extends Error
{
    public UsageError(String message)
    {
        super(message);
    }

    public UsageError(Throwable cause)
    {
        super(cause);
    }
}
