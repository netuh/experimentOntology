/**
 */
package codingExperimentOntology.variables.impl;

import codingExperimentOntology.apparatus.ResourceMonitorInstrument;

import codingExperimentOntology.variables.NewPackage1Package;
import codingExperimentOntology.variables.ResourceBasedVariable;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Based Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.variables.impl.ResourceBasedVariableImpl#getResourceMonitor <em>Resource Monitor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceBasedVariableImpl extends TimeBoundVariableImpl implements ResourceBasedVariable {
	/**
	 * The cached value of the '{@link #getResourceMonitor() <em>Resource Monitor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceMonitor()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceMonitorInstrument> resourceMonitor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceBasedVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage1Package.Literals.RESOURCE_BASED_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceMonitorInstrument> getResourceMonitor() {
		if (resourceMonitor == null) {
			resourceMonitor = new EObjectResolvingEList<ResourceMonitorInstrument>(ResourceMonitorInstrument.class, this, NewPackage1Package.RESOURCE_BASED_VARIABLE__RESOURCE_MONITOR);
		}
		return resourceMonitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage1Package.RESOURCE_BASED_VARIABLE__RESOURCE_MONITOR:
				return getResourceMonitor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewPackage1Package.RESOURCE_BASED_VARIABLE__RESOURCE_MONITOR:
				getResourceMonitor().clear();
				getResourceMonitor().addAll((Collection<? extends ResourceMonitorInstrument>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewPackage1Package.RESOURCE_BASED_VARIABLE__RESOURCE_MONITOR:
				getResourceMonitor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewPackage1Package.RESOURCE_BASED_VARIABLE__RESOURCE_MONITOR:
				return resourceMonitor != null && !resourceMonitor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceBasedVariableImpl
