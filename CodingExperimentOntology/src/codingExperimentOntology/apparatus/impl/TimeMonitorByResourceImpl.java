/**
 */
package codingExperimentOntology.apparatus.impl;

import codingExperimentOntology.apparatus.CodingArtifact;
import codingExperimentOntology.apparatus.NewPackage4Package;
import codingExperimentOntology.apparatus.TimeMonitorByResource;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Monitor By Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link codingExperimentOntology.apparatus.impl.TimeMonitorByResourceImpl#getArtifact <em>Artifact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeMonitorByResourceImpl extends TimeMonitorInstrumentImpl implements TimeMonitorByResource {
	/**
	 * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifact()
	 * @generated
	 * @ordered
	 */
	protected EList<CodingArtifact> artifact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeMonitorByResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewPackage4Package.Literals.TIME_MONITOR_BY_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodingArtifact> getArtifact() {
		if (artifact == null) {
			artifact = new EObjectResolvingEList<CodingArtifact>(CodingArtifact.class, this, NewPackage4Package.TIME_MONITOR_BY_RESOURCE__ARTIFACT);
		}
		return artifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewPackage4Package.TIME_MONITOR_BY_RESOURCE__ARTIFACT:
				return getArtifact();
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
			case NewPackage4Package.TIME_MONITOR_BY_RESOURCE__ARTIFACT:
				getArtifact().clear();
				getArtifact().addAll((Collection<? extends CodingArtifact>)newValue);
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
			case NewPackage4Package.TIME_MONITOR_BY_RESOURCE__ARTIFACT:
				getArtifact().clear();
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
			case NewPackage4Package.TIME_MONITOR_BY_RESOURCE__ARTIFACT:
				return artifact != null && !artifact.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TimeMonitorByResourceImpl
