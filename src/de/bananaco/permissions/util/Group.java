package de.bananaco.permissions.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import de.bananaco.permissions.worlds.WorldPermissions;
/**
 * The Group object extends Calculable which allows recursive inheritance of unlimited depth.
 * This is the new bPermissions, and it is awesome.
 */
public class Group extends Calculable {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Group(String name, List<String> groups, Set<Permission> permissions,
			WorldPermissions parent) {
		super(name, groups == null ? new HashSet() : new HashSet(groups),
				permissions, parent);
	}

	public int hashCode() {
		return getName().hashCode();
	}

}
