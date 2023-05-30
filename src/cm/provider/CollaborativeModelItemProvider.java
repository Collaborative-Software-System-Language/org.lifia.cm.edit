/**
 */
package cm.provider;


import cm.CmFactory;
import cm.CmPackage;
import cm.CollaborativeModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.uml2.uml.edit.providers.ModelItemProvider;

/**
 * This is the item provider adapter for a {@link cm.CollaborativeModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollaborativeModelItemProvider extends ModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborativeModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEnumSubActivityValuesPropertyDescriptor(object);
			addMembersKindValuesPropertyDescriptor(object);
			addEnumActivityKindValuesPropertyDescriptor(object);
			addEnumInteractionValuesPropertyDescriptor(object);
			addEnumPlayerKindValuesPropertyDescriptor(object);
			addEnumHapticEffectValuesPropertyDescriptor(object);
			addEnumHapticPriorityValuesPropertyDescriptor(object);
			addEnumHapticOrderValuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enum Sub Activity Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumSubActivityValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_enumSubActivityValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_enumSubActivityValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Members Kind Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMembersKindValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_membersKindValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_membersKindValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum Activity Kind Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumActivityKindValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_enumActivityKindValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_enumActivityKindValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum Interaction Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumInteractionValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_enumInteractionValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_enumInteractionValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum Player Kind Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumPlayerKindValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_enumPlayerKindValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_enumPlayerKindValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum Haptic Effect Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumHapticEffectValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_enumHapticEffectValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_enumHapticEffectValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum Haptic Priority Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumHapticPriorityValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_enumHapticPriorityValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_enumHapticPriorityValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enum Haptic Order Values feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnumHapticOrderValuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CollaborativeModel_enumHapticOrderValues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CollaborativeModel_enumHapticOrderValues_feature", "_UI_CollaborativeModel_type"),
				 CmPackage.Literals.COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CmPackage.Literals.COLLABORATIVE_MODEL__AWARENESS_KIND);
			childrenFeatures.add(CmPackage.Literals.COLLABORATIVE_MODEL__AWARENESS_INFO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CollaborativeModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CollaborativeModel"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CollaborativeModel)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CollaborativeModel_type") :
			getString("_UI_CollaborativeModel_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CollaborativeModel.class)) {
			case CmPackage.COLLABORATIVE_MODEL__ENUM_SUB_ACTIVITY_VALUES:
			case CmPackage.COLLABORATIVE_MODEL__MEMBERS_KIND_VALUES:
			case CmPackage.COLLABORATIVE_MODEL__ENUM_ACTIVITY_KIND_VALUES:
			case CmPackage.COLLABORATIVE_MODEL__ENUM_INTERACTION_VALUES:
			case CmPackage.COLLABORATIVE_MODEL__ENUM_PLAYER_KIND_VALUES:
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_EFFECT_VALUES:
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_PRIORITY_VALUES:
			case CmPackage.COLLABORATIVE_MODEL__ENUM_HAPTIC_ORDER_VALUES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_KIND:
			case CmPackage.COLLABORATIVE_MODEL__AWARENESS_INFO:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__NESTED_PACKAGE,
				 CmFactory.eINSTANCE.createCollaborativeModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createCollaborationRole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createSharedObject()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createCollaborativeActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createWorkspace()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createLocationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createUseRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createParticipationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createBelongsRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createSharedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createRoleMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createCollaborativeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createAwareness()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createAwarenessKind()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createRoleElementOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createElementOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__OWNED_TYPE,
				 CmFactory.eINSTANCE.createHapticIndicator()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createCollaborationRole()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createSharedObject()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createTool()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createCollaborativeActivity()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createWorkspace()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createLocationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createUseRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createParticipationRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createCollaborativeModel()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createBelongsRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createSharedRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createRoleMapping()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createCollaborativeProcess()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createAwareness()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createAwarenessKind()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createRoleElementOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createElementOperation()));

		newChildDescriptors.add
			(createChildParameter
				(UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT,
				 CmFactory.eINSTANCE.createHapticIndicator()));

		newChildDescriptors.add
			(createChildParameter
				(CmPackage.Literals.COLLABORATIVE_MODEL__AWARENESS_KIND,
				 CmFactory.eINSTANCE.createAwarenessKind()));

		newChildDescriptors.add
			(createChildParameter
				(CmPackage.Literals.COLLABORATIVE_MODEL__AWARENESS_INFO,
				 CmFactory.eINSTANCE.createAwareness()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == UMLPackage.Literals.NAMED_ELEMENT__NAME_EXPRESSION ||
			childFeature == UMLPackage.Literals.PACKAGE__PACKAGED_ELEMENT ||
			childFeature == UMLPackage.Literals.NAMESPACE__OWNED_RULE ||
			childFeature == UMLPackage.Literals.PACKAGE__NESTED_PACKAGE ||
			childFeature == UMLPackage.Literals.PACKAGE__OWNED_STEREOTYPE ||
			childFeature == UMLPackage.Literals.PACKAGE__OWNED_TYPE ||
			childFeature == CmPackage.Literals.COLLABORATIVE_MODEL__AWARENESS_INFO ||
			childFeature == CmPackage.Literals.COLLABORATIVE_MODEL__AWARENESS_KIND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CmEditPlugin.INSTANCE;
	}

}
